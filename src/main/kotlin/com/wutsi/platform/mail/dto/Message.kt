package com.wutsi.platform.mail.dto

import kotlin.String

public data class Message(
  public val subject: String = "",
  public val body: String = "",
  public val language: String? = null,
  public val mimeType: String? = null
)
