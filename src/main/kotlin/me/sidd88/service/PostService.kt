/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.service

import me.sidd88.entity.Post

/**
 * Service: Post
 */
interface PostService {

  /**
   * Get Post list
   */
  fun getPostList(): List<Post>

  /**
   * Get Post by ID
   */
  fun getPostById(id: Long): Post?
}