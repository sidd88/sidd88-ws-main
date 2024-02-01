/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.repository

import me.sidd88.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Repository: Post
 */
interface PostRepository: JpaRepository<Post, Long> {
}