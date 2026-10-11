package com.example

import android.app.Application

class GameApplication : Application() {
  companion object {
    init {
      try {
        android.system.Os.setenv("MESA_LOG_FILE", "/dev/null", true)
        android.system.Os.setenv("GALLIUM_LOG_FILE", "/dev/null", true)
        android.system.Os.setenv("MESA_DEBUG", "0", true)
        android.system.Os.setenv("LIBGL_DEBUG", "quiet", true)
        android.system.Os.setenv("EGL_LOG_LEVEL", "fatal", true)
      } catch (_: Exception) {}
    }
  }

  override fun onCreate() {
    super.onCreate()
    try {
      android.system.Os.setenv("MESA_LOG_FILE", "/dev/null", true)
      android.system.Os.setenv("GALLIUM_LOG_FILE", "/dev/null", true)
      android.system.Os.setenv("MESA_DEBUG", "0", true)
      android.system.Os.setenv("LIBGL_DEBUG", "quiet", true)
      android.system.Os.setenv("EGL_LOG_LEVEL", "fatal", true)
    } catch (_: Exception) {}
  }
}
