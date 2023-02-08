# RickAndMortyAPI
+ Para usarlo hay que tener JAVA 17 en la maquina, la base de datos es una que esta en la nube que ofrece una sola conexión.
## PUNTO 1:
 + /episode/{id}
 + Tipo: GET
 
 ## PUNTO 2:
 + /location
 + Tipo: POST
 + Body: {   "name": "earth",
    "type": "2",
    "dimension": "3l2",
    "url": "https://www.google.com/"
}
-----
 + /location/getall
 + Tipo: GET
 
 
## PUNTO 3:
 + /happy
 + Tipo: POST
 + Body: [
    {
        "number":14
    },
    {
        "number": 1
    }
]
## PUNTO 4:
 + /suma
 + Tipo: POST
 + Body: {
   "number": 100
  }
