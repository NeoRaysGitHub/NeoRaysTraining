FreeMarker Template example: Hello World!
=======================
===  County List   ====
=======================
<#list countries as country>
	${country_index + 1}. ${country}
</#list>