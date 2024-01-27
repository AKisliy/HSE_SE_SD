package iteratorTask

fun main(){
    val p1 = Photo("photo1", 0)
    val p2 = Photo("photo2", 1)
    val p3 = Photo("photo3", 2)

    val photoframe = Photoframe()
    photoframe.addPhotoRange(p1, p2, p3)

    for(photo in photoframe) {
        println("${photo.id}) ${photo.title}")
        Thread.sleep(1000)
    }
}