/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.model.site

import me.sidd88.entity.Post

/**
 * SiteView: Post list
 */
data class SiteViewPostList(
  override val title: String = "sidd88 :: Post list",
  val postList: List<ViewValuePost>
): SiteViewValue() {

  /**
   * SiteViewPostList companion object
   */
  companion object {

    /**
     * Create SiteViewBlogList object
     */
    fun build(entities: List<Post>): SiteViewPostList {
      return SiteViewPostList(
        postList = entities.map { ViewValuePost.fromEntity(it) }
      )
    }
  }
}
