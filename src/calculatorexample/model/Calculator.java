/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorexample.model;

import calculatorexample.model.Calculator.Data.DataType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rimi
 */
public class Calculator {

    /**
     * 계산과정에 포함될 피연산자, 연산자가 들어갈 리스트 참고로 시퀀스의 사이즈는 3을 넘어가서는 안된다.
     */
    private List<Data> sequence = new ArrayList<>();

    /**
     * 계산과정에 값을 넣는다.
     *
     * @param buttonText 클릭한 버튼의 텍스트
     */
    public void addData(String buttonText) {
        DataType type = findDataType(buttonText);
        sequence.add(new Data(buttonText, type));
    }

    public List<Data> getSequence() {
        return sequence;
    }

    /**
     * 디버깅을 위한 전체 계산과정을 반환한다.
     *
     * @return 계산과정을 병합한 문자열
     */
    public String getCurrentDatas() {
        String result = "";
        for (Data data : sequence) {
            result += data.getValue();
        }

        return result;
    }

    /**
     * 계산과정을 초기화한다.
     */
    public void reset() {
        sequence.clear();
    }

    /**
     * 변수에 해당하는 값의 타입을 반환한다.
     *
     * @param buttonText 클릭한 버튼의 텍스트
     * @return DataType
     */
    public DataType findDataType(String buttonText) {
        DataType returnValue;
        switch (buttonText) {
            case "+":
            case "-":
            case "*":
            case "/":
                returnValue = DataType.TYPE_OPERATOR;
                break;

            case "←":
            case "CE":
            case "=":
            case "C":
                returnValue = DataType.TYPE_COMMAND;
                break;

            default:
                returnValue = DataType.TYPE_INPUT;
                break;
        }

        return returnValue;
    }

    /**
     * 계산과정에 있는 정보를 토대로 결과를 반환한다.
     *
     * @return 계산 결과
     */
    public String calculateResult() {
        BigDecimal firstValue = new BigDecimal(sequence.get(sequence.size() - 3).getValue());
        String operator = sequence.get(sequence.size() - 2).getValue();
        BigDecimal secondValue = new BigDecimal(sequence.get(sequence.size() - 1).getValue());

        BigDecimal result = firstValue;
        switch (operator) {
            case "+":
                result = firstValue.add(secondValue);
                break;
            case "-":
                result = firstValue.subtract(secondValue);
                break;
            case "*":
                result = firstValue.multiply(secondValue);
                break;
            case "/":
                // BigDecimal의 divide에서는 스케일과 라운딩모드를 설정해줘야지
                // 오류가 발생안함
                result = firstValue.divide(secondValue, 2, BigDecimal.ROUND_CEILING);
                break;
        }

        reset();
        return result.toString();
    }

    /**
     * 계산과정에서 마지막에 입력된 값을 반환한다.
     *
     * @return 마지막 입력 값
     */
    public String getLastInput() {
        return sequence.get(sequence.size() - 1).getValue();
    }

    /**
     * ClearError를 실행한다.
     */
    public void resetLastInput() {
        editLatestInput("0");
    }

    /**
     * 계산과정의 2번째 피연산자의 값을 변경한다.
     *
     * @param text 변경할 값
     */
    public void editLatestInput(String text) {
        int latestIndex = sequence.size() - 1;
        Data data = sequence.get(latestIndex);
        data.setValue(text);
        sequence.set(latestIndex, data);
    }

    /**
     * 계산과정에 들어갈 값의 형태 클래스
     */
    public static class Data {

        /**
         * 값의 종류
         */
        public static enum DataType {
            TYPE_OPERATOR, TYPE_INPUT, TYPE_COMMAND
        };

        private String value;
        private DataType type;

        /**
         * @param value Data value
         * @param type Data type
         */
        public Data(String value, DataType type) {
            this.value = value;
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public DataType getType() {
            return type;
        }
    }
}
