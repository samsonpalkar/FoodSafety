/**
 * Created by samson.palkar on 2/15/2017.
 */
function baseHref()
{
    var base = location.pathname.indexOf("/",1);
    return location.protocol + "//" + location.host + location.pathname.substring(0,base) + "/";
}
function baseURL()
{
    return baseHref();
}