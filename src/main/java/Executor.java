import ChainOfResponsibility.*;

public class Executor {

    public static void main(String [] arg)
    {
        Processor processor = new NegativeProcessor(new PositiveProcessor(new ZeroProcessor(null)));
        RequestExample request1 = new RequestExample(10);
        RequestExample request2 = new RequestExample(-11);
        RequestExample request3 = new RequestExample(0);
        RequestExample request4 = new RequestExample(100);
        processor.process(request1);
        processor.process(request2);
        processor.process(request3);
        processor.process(request4);


    }
}
