package iteratorTask

class Photoframe : Iterable<Photo> {
    private val photos: MutableList<Photo> = mutableListOf()

    fun addPhoto(photo: Photo){
        photos.add(photo)
    }

    fun addPhotoRange(vararg newPhotos: Photo){
        photos.addAll(photos.size, newPhotos.toList())
    }
    override fun iterator(): Iterator<Photo> {
        return PhotoIterator(photos)
    }

    class PhotoIterator(private val photos: MutableList<Photo>, private var index: Int = 0): Iterator<Photo>{
        override fun hasNext(): Boolean {
            return true
        }

        override fun next(): Photo {
            return photos[(index++) % photos.size]
        }
    }
}