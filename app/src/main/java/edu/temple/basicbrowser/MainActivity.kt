package edu.temple.basicbrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    lateinit var urlEditText: EditText
    lateinit var goButton: ImageButton
    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        urlEditText = findViewById(R.id.urlEditText)
        goButton = findViewById(R.id.goButton)
        webView = findViewById(R.id.webView)

        var tempString : String? = null
        var tempInt : Int = 0

        //myButton.setOnClickListener { doSomething((it as Button).text) }

        goButton.setOnClickListener() {
            tempString = "www.YouTube.com"//urlEditText.text.toString()
            tempInt++
        }


        //val volleyQueue = Volley.newRequestQueue(this)
        //goButton.callOnClick()

        // Allow your browser to intercept hyperlink clicks
        webView.webViewClient = object: WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)



                    //tempString = "www.YouTube.com"
                    tempString?.let { webView.loadUrl(it) }


            }
        }

    }
}