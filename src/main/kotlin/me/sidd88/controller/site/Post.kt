/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.controller.site

import me.sidd88.model.site.SiteViewPost
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

/**
 * Posts Page
 */
@Controller
class PostController {

  @GetMapping("/posts")
  fun view(model: Model): String {
    val vv = SiteViewPost.build()
    model.addAttribute("vv", vv)
    return "post/main"
  }
}