/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.service.impl

import me.sidd88.entity.Post
import me.sidd88.exception.ResourceNotFoundException
import me.sidd88.repository.PostRepository
import me.sidd88.service.PostService
import org.springframework.stereotype.Service

/**
 * Service: Post
 */
@Service
class PostServiceImpl(
  private val postRepository: PostRepository
): PostService {

  /**
   * Get Post list
   */
  override fun getPostList(): List<Post> {
    return postRepository.findAll()
  }

  /**
   * Get Post by ID
   */
  override fun getPostById(id: Long): Post? {
    return postRepository.findById(id).orElseThrow { ResourceNotFoundException("Post", "id", id) }
  }
}