package com.achmadmiftahudin.batikuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.megamendung,"Asal Kota Cirebon","Batik Megamendung","Batik Megamendung memiliki" +
                "ciri khas gambar batik dari daerah pesisir pantai adalah warnanya yang lebih terang " +
                "sehingga memberikan kesan ceria kepada pemakainya"))

        data?.add(DataModel(R.drawable.gentongan,"Asal Madura","Batik Gentongan", "Warna batik ini juga cerah sehingga menampilkan kesan ceria pemakainya " +
                "Batik gentongan ini dibuat dengan hanya satu motif saja dan untuk mewarnainya, kain dicelupkan ke dalam gentong lalu motifnya digambar langsung di atas kainnya "))

        data?.add(DataModel(R.drawable.kawuh,"Asal Yogyakarta","Batik Kawuh", "Batik Kawung adalah salah satu motif batik tertua yang ada di Indonesia" +
                "Gambar batik ini sendiri terinspirasi dari bentuk buah kawung atau yang dikenal juga sebagai buah aren. "))

        data?.add(DataModel(R.drawable.priangan,"Asal Tasikmalaya","Batik Priangan", "Batik ini memiliki warna yang lebih cerah seperti biru muda, merah, atau hijau muda " +
                "an menggambarkan lingkungan alamnya. Motif daun, bunga, atau burung sering menjadi motif utama dalam batik ini."))

        data?.add(DataModel(R.drawable.sidomukti,"AsaL Magetan","Batik Sidomukti", "Batik sidomukti Magetan memiliki warna-warna yang terang dan jauh dari kesan kolot " +
                "Ciri khas dari motif batik ini adalah gambar bambu dan bunga-bunga sederhana."))

        data?.add(DataModel(R.drawable.sogan,"Asal Solo dan Yogyakarta","Batik Sogan", "Batik yang memang berasal dari Solo dan Yogyakarta ini memiliki ciri khas warna cokelat muda" +
                "dengan gambar batik beraksen bunga dan titik-titik, serta lengkungan dan garis di dalam motifnya." +
                "ogan sudah ada sejak era nenek moyang dan biasanya digunakan oleh raja-raja di keraton karena warnanya yang elegan, kombinasi coklat dan hitam. "))

        data?.add(DataModel(R.drawable.tambal,"Asal Yogyakarta","Batik Tambal", "Sesuai dengan namanya, batik tambal menyerupai kain tambalan " +
                "Motif yang terdiri dari beragam motif batik lainnya ini menyerupai kain patchwork yang dartabak manis atau yang aslinya bernamaibuat dari aneka kain perca. Secara filosofis, motif ini memiliki arti menambal sesuatu atau memperbaiki sesuatu yang rusak"))


        data?.add(DataModel(R.drawable.tujuhrupa,"Asal Pekalongan","Batik Tujuh Rupa", "Motif batik ini merupakan motif Pekalongan yang paling digemari " +
                "Dalam satu kain, warna dan gambar batik sangat beragam sehingga dikatakan tujuh rupa" ))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}