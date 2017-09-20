package me.zyly.riska.core.repository;

import me.zyly.riska.core.domain.TestDouble;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TestDoubleRepo extends PagingAndSortingRepository<TestDouble, String> {
}
