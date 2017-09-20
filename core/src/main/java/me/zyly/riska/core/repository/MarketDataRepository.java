package me.zyly.riska.core.repository;

import me.zyly.riska.core.domain.MarketData;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MarketDataRepository extends PagingAndSortingRepository<MarketData, String> {

    MarketData findOneByTradingDayAndInstrumentID(int tradingDay, String instrumentID);

    MarketData findOneByInstrumentInt(int instrumentInt, Sort sort);
}
