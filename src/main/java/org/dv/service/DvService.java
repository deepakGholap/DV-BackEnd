package org.dv.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dv.data.Data;
import org.dv.repo.DvRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class DvService {

  private final DvRepository  dvRepository;

  public List<Data> getData(){
    return dvRepository.findAll();
  }
}
