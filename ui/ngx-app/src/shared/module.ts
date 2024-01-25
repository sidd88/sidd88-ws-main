/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

import { RouterOutlet }                     from '@angular/router'
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
import { MatButtonModule }                  from '@angular/material/button'
import { MatFormFieldModule }               from '@angular/material/form-field'
import { MatInputModule }                   from '@angular/material/input'

/**
 * Angular core modules
 */
const CORE_MODULES = [
  FormsModule,
  MatButtonModule,
  MatFormFieldModule,
  MatInputModule,
  ReactiveFormsModule,
  RouterOutlet
]

export const MODULES = [
  CORE_MODULES
]
