import kotlin.browser.document

fun main(){
    changeHeader()
}


fun changeHeader(){
    val header = document.getElementById("header")
    header?.textContent = "Hello kotlin, Hello Obed"
}