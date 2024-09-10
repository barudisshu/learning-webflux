/*
 * COPYRIGHT Cplier 2024
 *
 * The copyright to the computer program(s) herein is the property of
 * Cplier Inc. The programs may be used and/or copied only with written
 * permission from Cplier Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 */

package com.cplier.service.impl;

import com.cplier.model.Director;
import com.cplier.repository.DirectorRepository;
import com.cplier.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class DirectorServiceImpl implements DirectorService {

  @Autowired private DirectorRepository directorRepository;

  @Override
  public Flux<Director> findAll() {
    return directorRepository.findAll();
  }

  @Override
  public Flux<Director> findByNameContaining(String name) {
    return directorRepository.findByNameContaining(name);
  }
}
