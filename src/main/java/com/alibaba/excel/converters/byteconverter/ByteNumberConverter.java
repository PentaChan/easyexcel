package com.alibaba.excel.converters.byteconverter;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

/**
 * Byte and number converter
 *
 * @author zhuangjiaju
 */
public class ByteNumberConverter implements Converter<Byte> {

    @Override
    public Class supportJavaTypeKey() {
        return Byte.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.NUMBER;
    }

    @Override
    public Byte convertToJavaData(CellData cellData, ExcelContentProperty contentProperty) {
        return cellData.getDoubleValue().byteValue();
    }

    @Override
    public CellData convertToExcelData(Byte value, ExcelContentProperty contentProperty) {
        return new CellData(value.doubleValue());
    }

}