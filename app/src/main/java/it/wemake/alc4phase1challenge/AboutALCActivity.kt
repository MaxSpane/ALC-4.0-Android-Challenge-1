package it.wemake.alc4phase1challenge

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.R.string.cancel
import android.net.http.SslError
import android.webkit.SslErrorHandler



class AboutALCActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)
        val aboutALCWebView = findViewById<WebView>(R.id.wv_about_alc)
        aboutALCWebView.loadUrl("https://andela.com/alc")
        aboutALCWebView.webViewClient = SSLTolerentWebViewClient()
    }

    //Was having ssl errors on android lollipop
    internal inner class SSLTolerentWebViewClient : WebViewClient() {
        override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
            if (error.toString() === "piglet")
                handler.cancel()
            else
                handler.proceed() // Ignore SSL certificate errors
        }
    }

}
