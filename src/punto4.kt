import java.security.Principal

fun main(){
//Declara una variable "edad" de tipo byte y asígnale el valor de 27.
//
var edad:Byte=27
    println("la edad es $edad")
//Declara una variable "año" de tipo short y asígnale el valor de 2022.
//
    var año :Short=2022
    println("el año es $año")
//Declara una variable "numeroDeAlumnos" de tipo int y asígnale el valor de 45.
//
    var numeroDeAlumnos:Int=45
    println("el numero de alumnos es : $numeroDeAlumnos")
//Declara una variable "poblacion" de tipo long y asígnale el valor de 1000000.
//
    var poblacion: Long= 1000000
    println("la poblacion es de $poblacion")
//Declara una variable "temperatura" de tipo float y asígnale el valor de 20.5.
//
    val temperatura: Float = 20.5F
    println("la temperatura es de $temperatura")
//Declara una variable "nombre" de tipo String y asígnale el valor "Juan".
//
    var nombre:String="juan"
    println("el nombre es $nombre")
//Declara una variable "precio" de tipo double y asígnale el valor de 19.99.
//
    var precio:Double=19.99
    println("el precio es de $precio")
//Declara una variable "inicial" de tipo char y asígnale el valor de 'J'.
//
    var inicial : Char= 'j'
    println("la inicial es $inicial")
//Declara una variable "colores" de tipo List y asígnale los valores ["rojo", "azul", "verde"].
//
    var colores: List<String>  = listOf("rojo", "azul", "verde")
    println("los colores son $colores")
//Declara una variable "numeros" de tipo Array y asígnale los valores [1, 2, 3, 4, 5].
//
    var numeros1 :Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(numeros1.joinToString())

//Declara una variable "identificador" de tipo byte y asígnale el valor de 123.
//
    var identificador :Byte=123
    println("el identificador es $identificador")
//Declara una variable "mes" de tipo short y asígnale el valor de 12.
//
    var mes : Short=12
    println("el mes es $mes")
//Declara una variable "numeroDeProductos" de tipo int y asígnale el valor de 150.
//
    var numeroDeProductos:Int= 150
    println("el numero de productos es $numeroDeProductos")
//Declara una variable "numeroDeTelefono" de tipo long y asígnale el valor de 5551234567.
//
    var numeroDeTelefono:Long=5551234567
    println("el numero de telefono es $numeroDeTelefono")
//Declara una variable "porcentajeDeDescuento" de tipo float y asígnale el valor de 10.5.
//
    var porcentajeDeDescuento: Float= 10.5F
    println("el porcentae de descuento es $porcentajeDeDescuento")
//Declara una variable "direccion" de tipo String y asígnale el valor "Calle 123, Colonia 456, Ciudad 789".
//
    var direccion :String = "Calle 123, Colonia 456, Ciudad 789"
    println("la direccion es $direccion")
//Declara una variable "tasaDeInteres" de tipo double y asígnale el valor de 3.5.
//
    var tasaDeInteres: Double=3.5
    println("la tasa de interes es $tasaDeInteres")
//Declara una variable "genero" de tipo char y asígnale el valor de 'M'.
//
    var genero: Char='M'
    println("el genero es $genero")
//Declara una variable "frutas" de tipo List y asígnale los valores ["manzana", "pera", "banana"].
//
    var frutas: List<String> = listOf("manzana", "pera", "banana")
    println("las frutas son $frutas")
//Declara una variable "notas" de tipo Array y asígnale los valores [7, 9, 8, 6, 10].
//
    var notas :Array<Int> = arrayOf(7, 9, 8, 6, 10)
    println("las notas son las siguientes "+notas.joinToString())
//Declara una variable "numeroDeHabitacion" de tipo byte y asígnale el valor de 5.
//
    var numeroDeHabitacion :Byte= 5
    println("el numero de habitacion es $numeroDeHabitacion")
//Declara una variable "dia" de tipo short y asígnale el valor de 31.
//
     var dia:Short=31
    println("el dia es $dia")
//Declara una variable "numeroDeEmpleados" de tipo int y asígnale el valor de 200.
//
    var numeroDeEmpleados: Int= 200
    println("el numero de empleados es $numeroDeEmpleados")
//Declara una variable "numeroDeOrden" de tipo long y asígnale el valor de 9876543210.
//
    var numeroDeOrden:Long = 9876543210
    println("el numero de orden es $numeroDeOrden")
//Declara una variable "iva" de tipo float y asígnale el valor de 16.0.
//
    var iva :Float= 16.0F
    println("el porentaje de iva es $iva")
//Declara una variable "correoElectronico" de tipo String y asígnale el valor: "ejemplo@dominio.com".
//
    var correoElectronico:String="ejemplo@dominio.com"
    println("la direcion de correo electronico es $correoElectronico")
//Declara una variable "cambioDolar" de tipo double y asígnale el valor de 19.50.
//
    var cambioDolar: Double=19.50
    println("el cambio de dolar es de $cambioDolar")
//Declara una variable "letra" de tipo char y asígnale el valor de 'A'.
//
    var letra :Char='a'
    println("la letra es $letra")
//Declara una variable "animales" de tipo List y asígnale los valores ["gato", "perro", "raton"].
//
    var animales:List<String> = listOf("gato", "perro", "raton")
    println("los animales son $animales")
//Declara una variable "calificaciones" de tipo Array y asígnale los valores [8, 7, 9, 8, 10].
    var calificaciones :Array<Int> = arrayOf(8, 7, 9, 8, 10)
    println("las calificaciones son "+calificaciones.joinToString())
}