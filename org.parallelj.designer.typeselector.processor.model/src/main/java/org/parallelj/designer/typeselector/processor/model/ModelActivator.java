/*
 *     ParallelJ, framework for parallel computing
 *     
 *     Copyright (C) 2010 Atos Worldline or third-party contributors as
 *     indicated by the @author tags or express copyright attribution
 *     statements applied by the authors.
 *     
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License.
 *     
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *     Lesser General Public License for more details.
 *     
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */
package org.parallelj.designer.typeselector.processor.model;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ModelActivator extends AbstractUIPlugin {

	private boolean imageRegistryUsed = false;

	// The plug-in ID
	public static final String PLUGIN_ID = "org.parallelj.designer.typeselector.processor.model";

	// The shared instance
	private static ModelActivator plugin;

	/**
	 * The constructor
	 */
	public ModelActivator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		ModelActivator.plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		if (this.imageRegistryUsed)
			ModelActivator.plugin.getImageRegistry().dispose();
		ModelActivator.plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static ModelActivator getDefault() {
		return ModelActivator.plugin;
	}

	/**
	 * Logs message with INFO severity in Error Log
	 * 
	 * @param message
	 *            : String
	 */
	public void logInfo(String message) {
		this.getLog().log(
				new Status(IStatus.INFO, ModelActivator.PLUGIN_ID, message));
	}

	/**
	 * Logs message with WARNING severity in Error Log
	 * 
	 * @param message
	 *            : String
	 */
	public void logWarning(String message) {
		this.getLog().log(
				new Status(IStatus.WARNING, ModelActivator.PLUGIN_ID, message));
	}

	/**
	 * Logs message with ERROR severity in Error Log
	 * 
	 * @param message
	 *            : String
	 */
	public void logError(String message) {
		this.getLog().log(
				new Status(IStatus.ERROR, ModelActivator.PLUGIN_ID, message));
	}

	/**
	 * Logs message and Throwable with Error severity in Error Log
	 * 
	 * @param message
	 *            : String
	 * @param t
	 *            : Throwable
	 */
	public void logError(String message, Throwable t) {
		this.getLog()
				.log(new Status(IStatus.ERROR, ModelActivator.PLUGIN_ID,
						message, t));
	}

	/**
	 * Returns image in current plugin
	 * 
	 * @param imageFilePath
	 *            : image File Path in plugin
	 * @return Image if exists
	 */
	public Image getImage(String imageFilePath) {
		return this.getImage(ModelActivator.PLUGIN_ID, imageFilePath);
	}

	/**
	 * Returns image in plugin
	 * 
	 * @param pluginId
	 *            : Id of the plugin containing thie image
	 * @param imageFilePath
	 *            : image File Path in plugin
	 * @return Image if exists
	 */
	public Image getImage(String pluginId, String imageFilePath) {
		this.imageRegistryUsed = true;
		Image image = ModelActivator.getDefault().getImageRegistry()
				.get(pluginId + ":" + imageFilePath);
		if (image == null)
			image = this.loadImage(pluginId, imageFilePath);
		return image;
	}

	/**
	 * Loads image in Image Registry is not available in it
	 * 
	 * @param pluginId
	 *            : Id of the plugin containing thie image
	 * @param imageFilePath
	 *            : image File Path in plugin
	 * @return Image if loaded
	 */
	private synchronized Image loadImage(String pluginId, String imageFilePath) {
		String id = pluginId + ":" + imageFilePath;
		Image image = ModelActivator.getDefault().getImageRegistry().get(id);
		if (image != null)
			return image;

		ImageDescriptor imageDescriptor = AbstractUIPlugin
				.imageDescriptorFromPlugin(pluginId, imageFilePath);
		if (imageDescriptor != null) {
			image = imageDescriptor.createImage();
			ModelActivator.getDefault().getImageRegistry()
					.put(pluginId + ":" + imageFilePath, image);
		}
		return image;
	}

}
