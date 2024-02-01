/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.model.site

import me.sidd88.entity.Post
import java.time.LocalDate

/**
 * ViewValue: Post
 */
data class ViewValuePost(
  val id:          Long?,
  val title:       String,
  val description: String?,
  val content:     String?,
  val publishedAt: LocalDate?
) {

  /**
   * ViewValuePost companion object
   */
  companion object {

    /**
     * Get ViewValue object from Entity
     */
    fun fromEntity(entity: Post) = ViewValuePost(
      id          = entity.id,
      title       = entity.title,
      description = entity.description,
      content     = entity.content,
      publishedAt = entity.publishAt
    )
  }
}