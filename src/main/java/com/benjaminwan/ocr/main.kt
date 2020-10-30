package com.benjaminwan.ocr

import com.benjaminwan.ocrlibrary.OcrEngine

fun main(args: Array<String>) {
    println(System.getProperty("java.library.path"))
    val ocrEngine = OcrEngine()
    val version = ocrEngine.getVersion()
    println("version=$version")
    ocrEngine.initLogger(
        isConsole = true,
        isPartImg = false,
        isAngleImg = false,
        isDebugImg = false,
        isResultImg = false
    )
    val ret = ocrEngine.initModels("models")
    println("init Models $ret")
    val ocrResult = ocrEngine.detect("test_imgs/1.jpg", 0)
    println(ocrResult.toString())
    return
}