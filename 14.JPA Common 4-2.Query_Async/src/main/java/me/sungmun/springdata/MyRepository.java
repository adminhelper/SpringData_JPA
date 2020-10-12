package me.sungmun.springdata;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface MyRepository<T, Id extends Serializable> extends Repository<T,Id> {

    <E extends T> E save(@NonNull  E entitiy);

    List<T> findAll();

    long count();

//    <E extends T>Optional<E> findById(Id Id);
    @Nullable
    //파라미터에 저장할라면 파라미터쪽에 적용하면된다.
    <E extends T> E findById(Id Id);
}
