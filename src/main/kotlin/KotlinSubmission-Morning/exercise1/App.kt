package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan : String = "Muhammad"
    val namaBelakang : String = "Fakhri Musyaffa"
    val umur: Int = 20
    val status: Boolean = true

    println("Nama depan saya yang diberikan orang tua : $namaDepan")
    println("Nama belakang saya yang diberikan orang tua : $namaBelakang")
    println("Umur saya saat ini $umur tahun")
    println("Status saya saat ini : ${if (status) "Belum Menikah" else "Sudah Menikah"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return "$groupId, $groupMember, $session"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val listAnggota = listOf("Ahmad","Irma", "Fakhri", "Fadli", "Aufal", "Raka", "Dandi", "Alief", "Farhan", "Fikri")
    val namaSaya = listAnggota[2]
    println("Perkenalkan nama saya $namaSaya")
    return listOf(listAnggota)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Ka Sarif", "Ka Meggy")
    val listAnggota = arrayOf("Ahmad","Irma", "Fakhri", "Fadli", "Aufal", "Raka", "Dandi", "Alief", "Farhan", "Fikri")
    val countOfGroup = mentor.size + listAnggota.size
    return countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Nawasenna", listOf("Ahmad","Irma", "Fakhri", "Fadli", "Aufal", "Raka", "Dandi", "Alief", "Farhan", "Fikri"), "Morning")

}