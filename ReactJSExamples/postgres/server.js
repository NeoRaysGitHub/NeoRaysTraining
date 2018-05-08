let express = require('express');
let bodyParser = require('body-parser');
let morgan = require('morgan');
let pg = require('pg');
let cors = require('cors');
const PORT = 3000;

//var connectionString = "postgres://postgres:cluster@"
let pool = new pg.Pool({
  user:'postgres',
  database: 'ReactJS',
  password:  'cluster',
  host: 'localhost',
  port: 5432,
  max : 10
});

let app = express();
app.use(cors);
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true}));

app.use(morgan('dev'));

app.use(function(request, response, next) {
  response.header("Access-Control-Allow-Origin", "*");
  response.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});

app.delete('/api/remove/:id',function(request,response){
  var id = request.params.country_id;
  console.log("errorr");
  pool.connect(function(err,db,done){
    if(err){
    return response.status(400).send(err);
    console.log("error");
    }
    else{
      db.query('delete from country where country_id =$1',[Number(id)],function(err,result){
        done();
        if(err){
          return response.status(400).send(err);
        }else{

          return response.status(200).send({message:'Data deleted!!'});
        }
      })
    }
  })
})

app.get('/api/countries',function(request,response){
  pool.connect(function(err,db,done){
    console.log(db);
    if(err){
    return response.status(400).send(err);
    }
    else{
      db.query('select * from country',function(err,table){
        done();
        if(err){
          return response.status(400).send(err);
        }else{

          return response.status(200).send(table.rows);
        }
      })
    }
  })
})


nb
app.post('/api/new-country', function(request,response){
var country_name = request.body.country_name;
var continent_name = request.body.continent_name;
var country_id = request.body.country_id;

let values = [country_name,continent_name,country_id];
pool.connect((err,db,done) => {
 if(err) {
  return response.status(400).send(err);
}else {

     db.query('insert into country ( country_name, continent_name, country_id) values ($1, $2, $3)',[...values], (err,table) => {
       done();
      if(err){
         return response.status(400).send(err);
      }else{
        console.log("INSERTING data...");

        response.status(201).send({message:'Data inserted!!'});
      }
     })
   }
 });
});
app.listen(PORT, () => console.log('listening to the port' + PORT));
