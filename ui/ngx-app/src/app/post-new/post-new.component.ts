import { Component }                          from '@angular/core'
import { FormControl, FormGroup, Validators } from '@angular/forms'

import { MODULES } from '@shared'

/**
 * Component: Create a new post
 */
@Component({
  standalone:  true,
  imports:     MODULES,
  templateUrl: './post-new.component.html',
  styleUrl:    './post-new.component.scss'
})
export class PostNewComponent {

  //-- [ Properties ] ----------------------------------------------------------

  /**
   * Form definition: Post
   */
  formGroup = new FormGroup({
    title:       new FormControl('Lorem Ipsum', Validators.required),
    description: new FormControl(null, Validators.required),
    content:     new FormControl(null)
  })

  /**
   * Submit form
   */
  onSubmit() {
    console.log(JSON.stringify(this.formGroup.value))
  }
}
