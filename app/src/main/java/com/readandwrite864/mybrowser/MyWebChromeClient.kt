package com.readandwrite864.mybrowser

import android.webkit.PermissionRequest
import android.webkit.WebChromeClient

class MyWebChromeClient : WebChromeClient() {
    override fun onPermissionRequest(request: PermissionRequest) {
        request.grant(request.resources)
    }
}
