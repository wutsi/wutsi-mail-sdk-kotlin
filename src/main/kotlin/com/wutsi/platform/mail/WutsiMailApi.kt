package com.wutsi.platform.mail

import com.wutsi.platform.mail.dto.SendMessageRequest
import com.wutsi.platform.mail.dto.SendMessageResponse
import feign.Headers
import feign.RequestLine

public interface WutsiMailApi {
  @RequestLine("POST /v1/mail/messages")
  @Headers(value=["Content-Type: application/json"])
  public fun sendMessage(request: SendMessageRequest): SendMessageResponse
}
