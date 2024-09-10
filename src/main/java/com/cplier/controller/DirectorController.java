/*
 * COPYRIGHT Cplier 2024
 *
 * The copyright to the computer program(s) herein is the property of
 * Cplier Inc. The programs may be used and/or copied only with written
 * permission from Cplier Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 */

package com.cplier.controller;

import com.cplier.model.Director;
import com.cplier.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/director")
public class DirectorController {

  @Autowired private DirectorService directorService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Flux<Director> getAllDirectories(@RequestParam(required = false) String name) {
    if (name == null) {
      return directorService.findAll();
    } else {
      return directorService.findByNameContaining(name);
    }
  }
}
