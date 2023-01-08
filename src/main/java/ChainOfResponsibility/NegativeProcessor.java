package ChainOfResponsibility;

public class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(RequestExample request) {
        if (request.getNumber() < 0) {
            System.out.println(request.getNumber() + " is Negative Number");
        } else {
            super.hasNext(request);
        }
    }
}
