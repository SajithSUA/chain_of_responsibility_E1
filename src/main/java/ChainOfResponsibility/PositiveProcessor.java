package ChainOfResponsibility;

public class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(RequestExample request) {
        if (request.getNumber() > 0) {
            System.out.println(request.getNumber() + " is Positive Number");
        } else {
            super.hasNext(request);
        }
    }
}
