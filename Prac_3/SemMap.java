package Prac_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SemMap<K, V> implements Map<K, V> {

    private final Semaphore semaphore;

    private final Map<K, V> map;
    SemMap(){
        semaphore = new Semaphore(1);
        map = new HashMap();
    }

    @Override
    public int size() {
        try {
            semaphore.acquire();
            return map.size();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        try {
            semaphore.acquire();
            return map.isEmpty();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        try {
            semaphore.acquire();
            return map.containsKey(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        try {
            semaphore.acquire();
            return map.containsValue(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return false;
    }

    @Override
    public V get(Object key) {
        try {
            semaphore.acquire();
            return map.get(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return null;
    }

    @Override
    public V put(Object key, Object value) {
        try {
            semaphore.acquire();
            return map.put((K) key, (V) value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        try {
            semaphore.acquire();
            return map.remove(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return null;
    }

    @Override
    public void putAll(Map m) {
        try {
            semaphore.acquire();
            map.putAll(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            map.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Set keySet() {
        try {
            semaphore.acquire();
            return map.keySet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return null;
    }

    @Override
    public Collection values() {
        try {
            semaphore.acquire();
            return map.values();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        try {
            semaphore.acquire();
            return map.entrySet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return null;
    }
}
