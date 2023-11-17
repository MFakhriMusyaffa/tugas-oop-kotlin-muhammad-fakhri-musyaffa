package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        print("Masukkan umur Anda saat ini : ")
        val inputData = readLine()
        val umur = inputData?.toInt()

        if (umur != null) {
            println("Umur Anda ialah : $umur tahun")
        } else {
            throw NumberFormatException("Input tidak termasuk bilangan bulat")
        }

    } catch (e: NumberFormatException) {
        println("Maaf, pastikan anda memasukkan umur sesuai dengan format bilangan bulat.")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

