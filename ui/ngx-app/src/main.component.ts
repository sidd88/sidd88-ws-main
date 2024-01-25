/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

import { Component } from '@angular/core'
import { RouterOutlet } from '@angular/router'
import { CommonModule } from '@angular/common'

/**
 * List module to Register into component
 */
const MODULES = [
  CommonModule,
  RouterOutlet
]

/**
 * Main component
 */
@Component({
  selector:   'ngx-app-root',
  standalone: true,
  imports:    MODULES,
  template:   '<router-outlet></router-outlet>'
})
export class MainComponent {

}
