package be.kokotchy.testinglog4j;

import org.apache.log4j.*;


/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger LOG = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        LOG.info( "Info message");
        LOG.error( "Error message" );
        LOG.warn( "Warning message" );
        LOG.debug( "Debug message" );
        LOG.fatal("Fatal message");
    }
}
