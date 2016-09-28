package jeus.ejb.timer.containers;

import jeus.util.message.JeusMessage_EJB11;
import jeus.util.Serializer;

public class imerBeanBaseImpl315477846 extends TimerBean implements jeus.ejb.bean.objectbase.FieldAccessor
{

	public imerBeanBaseImpl315477846()
	{
		super();
	}
	public jeus.ejb.timer.containers.TimerBean.Blob blob;
	
	public jeus.ejb.timer.containers.TimerBean.Blob getBlob()
	{
		if(!_modified[0] && !_loaded[0])
		{
			_cmEntityContainer.cmEJBPostLoad(this,0);
			_loaded[0] = true;
		}
		if(blob != null) {
			return (jeus.ejb.timer.containers.TimerBean.Blob) Serializer.cloneObjectStatic(blob);
		}
		return null;
	}
	
	public void setBlob(jeus.ejb.timer.containers.TimerBean.Blob blob)
	{
		_modified[0] = true;
		if(blob != null) {
			this.blob = (jeus.ejb.timer.containers.TimerBean.Blob) Serializer.cloneObjectStatic(blob);
		}else {
			this.blob = null;
		}
	}
	public java.lang.String ownerId;
	
	public java.lang.String getOwnerId()
	{
		return ownerId;
	}
	
	public void setOwnerId(java.lang.String ownerId)
	{
		_modified[1] = true;
		this.ownerId = ownerId;
	}
	public java.lang.String containerId;
	
	public java.lang.String getContainerId()
	{
		if(!_modified[2] && !_loaded[0])
		{
			_cmEntityContainer.cmEJBPostLoad(this,0);
			_loaded[0] = true;
		}
		return containerId;
	}
	
	public void setContainerId(java.lang.String containerId)
	{
		_modified[2] = true;
		this.containerId = containerId;
	}
	public long creationTimeRaw;
	
	public long getCreationTimeRaw()
	{
		if(!_modified[3] && !_loaded[0])
		{
			_cmEntityContainer.cmEJBPostLoad(this,0);
			_loaded[0] = true;
		}
		return creationTimeRaw;
	}
	
	public void setCreationTimeRaw(long creationTimeRaw)
	{
		_modified[3] = true;
		this.creationTimeRaw = creationTimeRaw;
	}
	public long lastExpirationRaw;
	
	public long getLastExpirationRaw()
	{
		if(!_modified[4] && !_loaded[0])
		{
			_cmEntityContainer.cmEJBPostLoad(this,0);
			_loaded[0] = true;
		}
		return lastExpirationRaw;
	}
	
	public void setLastExpirationRaw(long lastExpirationRaw)
	{
		_modified[4] = true;
		this.lastExpirationRaw = lastExpirationRaw;
	}
	public long intervalDuration;
	
	public long getIntervalDuration()
	{
		if(!_modified[5] && !_loaded[0])
		{
			_cmEntityContainer.cmEJBPostLoad(this,0);
			_loaded[0] = true;
		}
		return intervalDuration;
	}
	
	public void setIntervalDuration(long intervalDuration)
	{
		_modified[5] = true;
		this.intervalDuration = intervalDuration;
	}
	public long initialExpirationRaw;
	
	public long getInitialExpirationRaw()
	{
		if(!_modified[6] && !_loaded[0])
		{
			_cmEntityContainer.cmEJBPostLoad(this,0);
			_loaded[0] = true;
		}
		return initialExpirationRaw;
	}
	
	public void setInitialExpirationRaw(long initialExpirationRaw)
	{
		_modified[6] = true;
		this.initialExpirationRaw = initialExpirationRaw;
	}
	public java.lang.Long timerId;
	
	public java.lang.Long getTimerId()
	{
		return timerId;
	}
	
	public void setTimerId(java.lang.Long timerId)
	{
		_modified[7] = true;
		this.timerId = timerId;
	}
	public java.util.Set ejbSelectTimerIdsByContainer(java.lang.String arg0, java.lang.String arg1) throws javax.ejb.FinderException
	{
		java.lang.Object[] findargs = new Object[2];
		findargs[0] = arg0;
		findargs[1] = arg1;
		boolean isIncludeUpdate = false;
		return (java.util.Set)_cmEntityContainer.cmEJBSelect("ejbSelectTimerIdsByContainer(java.lang.String,java.lang.String)", findargs, isIncludeUpdate);
	}
	public java.util.Set ejbSelectAllTimerIds(java.lang.String arg0) throws javax.ejb.FinderException
	{
		java.lang.Object[] findargs = new Object[1];
		findargs[0] = arg0;
		boolean isIncludeUpdate = false;
		return (java.util.Set)_cmEntityContainer.cmEJBSelect("ejbSelectAllTimerIds(java.lang.String)", findargs, isIncludeUpdate);
	}
	public java.util.Set ejbSelectTimersByContainer(java.lang.String arg0, java.lang.String arg1) throws javax.ejb.FinderException
	{
		java.lang.Object[] findargs = new Object[2];
		findargs[0] = arg0;
		findargs[1] = arg1;
		boolean isIncludeUpdate = false;
		return (java.util.Set)_cmEntityContainer.cmEJBSelect("ejbSelectTimersByContainer(java.lang.String,java.lang.String)", findargs, isIncludeUpdate);
	}
	public java.util.Set ejbSelectAllTimers(java.lang.String arg0) throws javax.ejb.FinderException
	{
		java.lang.Object[] findargs = new Object[1];
		findargs[0] = arg0;
		boolean isIncludeUpdate = false;
		return (java.util.Set)_cmEntityContainer.cmEJBSelect("ejbSelectAllTimers(java.lang.String)", findargs, isIncludeUpdate);
	}
	public boolean _getBoolean(int idx, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public void _setBoolean(int idx, boolean _fValue, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public byte _getByte(int idx, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public void _setByte(int idx, byte _fValue, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public char _getCharactor(int idx, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public void _setCharactor(int idx, char _fValue, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public short _getShort(int idx, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public void _setShort(int idx, short _fValue, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public int _getInt(int idx, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public void _setInt(int idx, int _fValue, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public float _getFloat(int idx, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public void _setFloat(int idx, float _fValue, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public double _getDouble(int idx, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public void _setDouble(int idx, double _fValue, boolean direct)
	{
		switch(idx)
		{
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public long _getLong(int idx, boolean direct)
	{
		switch(idx)
		{
			case 3:
				if(direct)
					return this.creationTimeRaw;
				else
					return getCreationTimeRaw();
			case 4:
				if(direct)
					return this.lastExpirationRaw;
				else
					return getLastExpirationRaw();
			case 5:
				if(direct)
					return this.intervalDuration;
				else
					return getIntervalDuration();
			case 6:
				if(direct)
					return this.initialExpirationRaw;
				else
					return getInitialExpirationRaw();
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public void _setLong(int idx, long _fValue, boolean direct)
	{
		switch(idx)
		{
			case 3:
				if(!direct)
					_modified[3] = true;
				this.creationTimeRaw = (long)_fValue;
			break;
			case 4:
				if(!direct)
					_modified[4] = true;
				this.lastExpirationRaw = (long)_fValue;
			break;
			case 5:
				if(!direct)
					_modified[5] = true;
				this.intervalDuration = (long)_fValue;
			break;
			case 6:
				if(!direct)
					_modified[6] = true;
				this.initialExpirationRaw = (long)_fValue;
			break;
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public Object _get(int idx, boolean direct)
	{
		switch(idx)
		{
			case 0:
				if(direct)
					return this.blob;
				else
					return getBlob();
			case 1:
				if(direct)
					return this.ownerId;
				else
					return getOwnerId();
			case 2:
				if(direct)
					return this.containerId;
				else
					return getContainerId();
			case 7:
				if(direct)
					return this.timerId;
				else
					return getTimerId();
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	public void _set(int idx, Object _fValue, boolean direct)
	{
		switch(idx)
		{
			case 0:
				if(!direct)
					_modified[0] = true;
				this.blob = (jeus.ejb.timer.containers.TimerBean.Blob)_fValue;
			break;
			case 1:
				if(!direct)
					_modified[1] = true;
				this.ownerId = (java.lang.String)_fValue;
			break;
			case 2:
				if(!direct)
					_modified[2] = true;
				this.containerId = (java.lang.String)_fValue;
			break;
			case 7:
				if(!direct)
					_modified[7] = true;
				this.timerId = (java.lang.Long)_fValue;
			break;
			default:
				throw new javax.ejb.EJBException("field index and field type don't match");
		}
	}
	
	private jeus.ejb.container.CMEntityContainer _cmEntityContainer;
	private jeus.ejb.bean.objectbase.EJBLocalObjectImpl _ejbLocalObject;
	private boolean[] _loaded = new boolean[1];
	private boolean[] _modified = new boolean[8];
	public void _init(jeus.ejb.container.CMEntityContainer _cmEntityContainer, jeus.ejb.bean.objectbase.EJBLocalObjectImpl _ejbLocalObject)
	{
		this._cmEntityContainer = _cmEntityContainer;
		this._ejbLocalObject = _ejbLocalObject;
	}
	public jeus.ejb.bean.objectbase.EJBLocalObjectImpl getEJBLocalObjectImpl()
	{
		return _ejbLocalObject;
	}
	public void _setLoadInfo()
	{
		_loaded[0] = true;
	}
	public void _clearLoadInfo()
	{
		_loaded[0] = false;
	}
	public boolean[] _getModifiedInfo()
	{
		return _modified;
	}
	public void _clearModifiedInfo()
	{
		_modified[0] = false;
		_modified[1] = false;
		_modified[2] = false;
		_modified[3] = false;
		_modified[4] = false;
		_modified[5] = false;
		_modified[6] = false;
		_modified[7] = false;
	}
	public void _postCreation()
	{
		_modified[0] = false;
		_modified[1] = false;
		_modified[2] = false;
		_modified[3] = false;
		_modified[4] = false;
		_modified[5] = false;
		_modified[6] = false;
		_modified[7] = false;
	}
	public void _initFields()
	{
		blob = null;
		ownerId = null;
		containerId = null;
		creationTimeRaw = (long)0;
		lastExpirationRaw = (long)0;
		intervalDuration = (long)0;
		initialExpirationRaw = (long)0;
		timerId = null;
		_loaded[0] = true;
	}
}
