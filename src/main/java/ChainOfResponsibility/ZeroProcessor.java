package ChainOfResponsibility;

public class ZeroProcessor extends Processor {

    public ZeroProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(RequestExample request) {
        if(request.getNumber() == 0)
        {
            System.out.println(request.getNumber() + " is Zero Number");
        }
        else
        {
            super.hasNext(request);
        }

    }
}
