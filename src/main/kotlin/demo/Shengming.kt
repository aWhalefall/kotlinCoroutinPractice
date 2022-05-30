package demo


data class ParagraphStyling(
    val textStyle: String,
    val textStyle2: String

)

fun main() {
    /***
     *   ParagraphStyling var1 = getConstraction();
    String textStyle = var1.component1();
    System.out.print(textStyle);
     */
    val (textStyle) = getConstraction()
    print(textStyle)
}

fun getConstraction(): ParagraphStyling {
    return ParagraphStyling(
        "我是第一个参数", "textStyle"
    )
}

