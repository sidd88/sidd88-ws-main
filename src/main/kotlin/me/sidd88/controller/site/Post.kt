/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.controller.site

import me.sidd88.model.site.SiteViewPostList
import me.sidd88.service.PostService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Posts Page
 */
@Controller
@RequestMapping("/posts")
class PostController(
  private val postService: PostService
) {

  /**
   * Post list
   */
  @GetMapping
  fun list(model: Model): String {
    val posts = postService.getPostList()
    val vv    = SiteViewPostList.build(posts)
    model.addAttribute("vv", vv)
    return "post/list/main"
  }
}