package com.wutsi.platform.mail

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-mail-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-mail-server-prod.herokuapp.com"),
  ;
}
