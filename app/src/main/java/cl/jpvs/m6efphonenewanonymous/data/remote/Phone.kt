package cl.jpvs.m6efphonenewanonymous.data.remote

data class Phone(
    val id:Int,
    val name :String,
    val price: Int,
    val image: String
) {

}

/*
   la data Clase Phone define
   data class -> A través de una data class podremos  indicar los campos que vamos a  transformar a objetos.
    Estos deben  ser una representación de los datos a  recibir en Json.

    "id": 1,
"name": "Samsung Galaxy A21s 64GB",
"price": 167253,
"image": "https://images.samsung.com/is/image/samsung/es-galaxy-a21s-sm-a217fzkoeub-262755098?$PD_GALLERY_L_JPG$"

*/