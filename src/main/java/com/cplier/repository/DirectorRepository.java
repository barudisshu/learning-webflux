/*
 * COPYRIGHT Cplier 2024
 *
 * The copyright to the computer program(s) herein is the property of
 * Cplier Inc. The programs may be used and/or copied only with written
 * permission from Cplier Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 */

package com.cplier.repository;

import com.cplier.model.Director;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface DirectorRepository extends R2dbcRepository<Director, Long> {

  Flux<Director> findByNameContaining(String name);
}
