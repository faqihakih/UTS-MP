package com.example.uts_mp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_mp.R
import com.example.uts_mp.adapter.ImageAdapter

class BeritaActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        val imageList = listOf<Image>(
            Image(
                R.drawable.berita1,
                "Moeldoko: Apa yang Harus Direkonsiliasi dengan Habib Rizieq?",
                "Jakarta - Pemimpin Front Pembela Islam (FPI) Habib Rizieq Syihab mengaku siap rekonsiliasi dengan pemerintah asalkan menghentikan kriminalisasi ulama. Kepala Staf Kepresidenan Moeldoko mempertanyakan maksud rekonsiliasi tersebut."
            ),
            Image(
                R.drawable.berita2,
                "Buruh dan Mahasiswa Bergerak Kepung Istana, Demo Omnibus Law",
                "Jakarta, CNN Indonesia -- Massa buruh yang tergabung dalam Gerakan Buruh Bersama Rakyat (Gebrak), serta sejumlah Aliansi Mahasiswa, petani, hingga elemen masyarakat dari kalangan pemuda dan perempuan pejuang akan berdemonstrasi di seberang Istana Negara siang ini, Selasa (10/11). "
            ),
            Image(
                R.drawable.berita3,
                "Tito Tunda Pilkades Hingga Sesudah Pilkada",
                "Pertimbangannya adalah darurat bencana pandemi COVID-19 di Indonesia dikhawatirkan berpotensi menimbulkan penularan apabila dilakukan tanpa protokol kesehatan yang ketat. Hal tersebut dikatakan Mendagri pada acara Rapat Koordinasi Pusat dan Daerah terkait Perubahan Kedua Atas Permendagri Nomor 112 Tahun 2014 tentang Pemilihan Kepala Desa, di Kantor Kemendagri, Jakarta, Kamis (12/11/2020)."
            ),
            Image(
                R.drawable.berita4,
                "Pimpinan KPK ke Calon Kepala Daerah: Kalau Mau Mewah Jadi Selebriti Saja!",
                "Jakarta - Para calon kepala daerah yang akan berlaga dalam Pilkada Serentak 2020 mendapatkan wejangan dari pimpinan KPK. Mereka diingatkan untuk menjadi pejabat yang benar-benar melayani rakyat.\n" +
                        "Dalam webinar pembekalan pilkada yang disiarkan kanal YouTube KPK, Wakil Ketua KPK Nurul Ghufron menjelaskan menjadi pejabat bukan ajang untuk meningkatkan harta kekayaan pribadi. Terlebih, menurut Ghufron, cara-cara seperti korupsi yang sudah terbukti tidak hanya merugikan diri sendiri."
            ),
            Image(
                R.drawable.berita5,
                "Apa yang mungkin akan dilakukan Donald Trump setelah meninggalkan Gedung Putih",
                "Donald Trump akan tetap menjabat sampai tanggal 20 Januari 2021 ketika ia menyerahkan posisi presiden kepada penerusnya dan kemudian masuk ke dalam klub eksklusif para mantan presiden Amerika Serikat (AS). Jadi apa yang akan dilakukan oleh politikus dan pengusaha kaya itu?\n" +
                        "\n" +
                        "Peluang yang dapat dilakukan Trump termasuk bisa menjadi pembicara di berbagai acara, menulis memoir, merencanakan perpusatakan kepresidenan."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}