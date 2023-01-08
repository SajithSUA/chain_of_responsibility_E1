package ChainOfResponsibility;

public abstract class Processor {
    private Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void hasNext(RequestExample request)
    {
        if (nextProcessor != null) {
            nextProcessor.process(request);
        }
    }
    public abstract void process(RequestExample request);
}
