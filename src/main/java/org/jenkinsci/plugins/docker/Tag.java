package org.jenkinsci.plugins.docker;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

public final class Tag extends AbstractDescribableImpl<Tag> {

    private final String tag;

    @DataBoundConstructor
    public Tag(final String tag) {
        super();

        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<Tag> {
        @Override
        public String getDisplayName() {
            return "";
        }
    }
}
