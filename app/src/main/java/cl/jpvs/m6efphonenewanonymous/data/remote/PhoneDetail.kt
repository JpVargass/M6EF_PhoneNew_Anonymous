package cl.jpvs.m6efphonenewanonymous.data.remote

data class PhoneDetail(
    val id: Int,
    val name: String,
    val price: Int,
    val image: String,
    val description:String,
    val lastPrice:Int,
    val credit: Boolean
)

/*
*
  {
  "id": 1,
  "name": "Samsung Galaxy A21s 64GB",
  "price": 167253,
  "image": "https://images.samsung.com/is/image/samsung/es-galaxy-a21s-sm-a217fzkoeub-262755098?$PD_GALLERY_L_JPG$",
  "description": "Tamaño 6,5''\n Densidad 294 ppi\nResolución de pantalla 720 x 1600",
  "lastPrice": 177253,
  "credit": true
}
* {
  "id": 2,
  "name": "Huawei Nova 7 SE 128GB",
  "price": 347760,
  "image": "https://consumer-img.huawei.com/content/dam/huawei-cbg-site/common/mkt/pdp/phones/nova7-se/img/pc/huawei-nova7-se-side-mounted-fingerprint-unlock-space-silver.png",
  "description": "Tamaño 6,5''\nDensidad 405 ppi\nResolución de pantalla 1080 x 2400 pixeles",
  "lastPrice": 347960,
  "credit": true
}
{
  "id": 3,
  "name": "Apple iPhone 7 32GB",
  "price": 323760,
  "image": "https://daisycon.io/images/mobile-device/?width=250&height=250&color=ffffff&mobile_device_brand=apple&mobile_device_model=iphone+7+32gb&mobile_device_color=silver",
  "description": "Tamaño 4,7''\nDensidad 326 ppi\nResolución de pantalla 1334 x 750 pixeles",
  "lastPrice": 393760,
  "credit": true
}*
*
  *
*
* */