 $(document).ready(function() {
            $("#div1").click(function () {
               var content = $(this).html();
               $("#result").text( content );
            });
         });


         $(document).ready(function() {
             $("#div2").click(function () {
                $(this).replaceWith("<h1>JQuery is Great</h1>");
             });
          });