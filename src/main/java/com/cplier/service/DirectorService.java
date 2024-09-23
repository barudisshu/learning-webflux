/*
 * COPYRIGHT Cplier 2024
 *
 * The copyright to the computer program(s) herein is the property of
 * Cplier Inc. The programs may be used and/or copied only with written
 * permission from Cplier Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 */

package com.cplier.service;

import com.cplier.model.Director;
import reactor.core.publisher.Flux;

public interface DirectorService {

  Flux<Director> findAll();

  Flux<Director> findByNameContaining(String name);
}
