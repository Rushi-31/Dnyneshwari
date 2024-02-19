package com.dyneshwari

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.github.barteksc.pdfviewer.PDFView

class PdfActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)
        val pdfView: PDFView =findViewById(R.id.pdfview)
        val pdfPath = intent.getStringExtra("pdfPath")
        pdfView.fromAsset(pdfPath.toString()).load()
    }
}
