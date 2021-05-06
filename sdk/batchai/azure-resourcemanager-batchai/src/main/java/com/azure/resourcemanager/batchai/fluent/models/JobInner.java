// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batchai.models.Caffe2Settings;
import com.azure.resourcemanager.batchai.models.CaffeSettings;
import com.azure.resourcemanager.batchai.models.ChainerSettings;
import com.azure.resourcemanager.batchai.models.CntKsettings;
import com.azure.resourcemanager.batchai.models.ContainerSettings;
import com.azure.resourcemanager.batchai.models.CustomMpiSettings;
import com.azure.resourcemanager.batchai.models.CustomToolkitSettings;
import com.azure.resourcemanager.batchai.models.EnvironmentVariable;
import com.azure.resourcemanager.batchai.models.EnvironmentVariableWithSecretValue;
import com.azure.resourcemanager.batchai.models.ExecutionState;
import com.azure.resourcemanager.batchai.models.HorovodSettings;
import com.azure.resourcemanager.batchai.models.InputDirectory;
import com.azure.resourcemanager.batchai.models.JobPreparation;
import com.azure.resourcemanager.batchai.models.JobPriority;
import com.azure.resourcemanager.batchai.models.JobPropertiesConstraints;
import com.azure.resourcemanager.batchai.models.JobPropertiesExecutionInfo;
import com.azure.resourcemanager.batchai.models.MountVolumes;
import com.azure.resourcemanager.batchai.models.OutputDirectory;
import com.azure.resourcemanager.batchai.models.ProvisioningState;
import com.azure.resourcemanager.batchai.models.PyTorchSettings;
import com.azure.resourcemanager.batchai.models.ResourceId;
import com.azure.resourcemanager.batchai.models.TensorFlowSettings;
import com.azure.resourcemanager.batchai.models.ToolType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Information about a Job. */
@JsonFlatten
@Fluent
public class JobInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobInner.class);

    /*
     * Scheduling priority associated with the job.
     */
    @JsonProperty(value = "properties.schedulingPriority")
    private JobPriority schedulingPriority;

    /*
     * Resource ID of the cluster associated with the job.
     */
    @JsonProperty(value = "properties.cluster")
    private ResourceId cluster;

    /*
     * Collection of mount volumes available to the job during execution. These
     * volumes are mounted before the job execution and unmounted after the job
     * completion. The volumes are mounted at location specified by
     * $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable.
     */
    @JsonProperty(value = "properties.mountVolumes")
    private MountVolumes mountVolumes;

    /*
     * The job will be gang scheduled on that many compute nodes
     */
    @JsonProperty(value = "properties.nodeCount")
    private Integer nodeCount;

    /*
     * If the container was downloaded as part of cluster setup then the same
     * container image will be used. If not provided, the job will run on the
     * VM.
     */
    @JsonProperty(value = "properties.containerSettings")
    private ContainerSettings containerSettings;

    /*
     * Possible values are: cntk, tensorflow, caffe, caffe2, chainer, pytorch,
     * custom, custommpi, horovod.
     */
    @JsonProperty(value = "properties.toolType")
    private ToolType toolType;

    /*
     * CNTK (aka Microsoft Cognitive Toolkit) job settings.
     */
    @JsonProperty(value = "properties.cntkSettings")
    private CntKsettings cntkSettings;

    /*
     * pyTorch job settings.
     */
    @JsonProperty(value = "properties.pyTorchSettings")
    private PyTorchSettings pyTorchSettings;

    /*
     * TensorFlow job settings.
     */
    @JsonProperty(value = "properties.tensorFlowSettings")
    private TensorFlowSettings tensorFlowSettings;

    /*
     * Caffe job settings.
     */
    @JsonProperty(value = "properties.caffeSettings")
    private CaffeSettings caffeSettings;

    /*
     * Caffe2 job settings.
     */
    @JsonProperty(value = "properties.caffe2Settings")
    private Caffe2Settings caffe2Settings;

    /*
     * Chainer job settings.
     */
    @JsonProperty(value = "properties.chainerSettings")
    private ChainerSettings chainerSettings;

    /*
     * Custom tool kit job settings.
     */
    @JsonProperty(value = "properties.customToolkitSettings")
    private CustomToolkitSettings customToolkitSettings;

    /*
     * Custom MPI job settings.
     */
    @JsonProperty(value = "properties.customMpiSettings")
    private CustomMpiSettings customMpiSettings;

    /*
     * Specifies the settings for Horovod job.
     */
    @JsonProperty(value = "properties.horovodSettings")
    private HorovodSettings horovodSettings;

    /*
     * The specified actions will run on all the nodes that are part of the job
     */
    @JsonProperty(value = "properties.jobPreparation")
    private JobPreparation jobPreparation;

    /*
     * A segment of job's output directories path created by Batch AI. Batch AI
     * creates job's output directories under an unique path to avoid conflicts
     * between jobs. This value contains a path segment generated by Batch AI
     * to make the path unique and can be used to find the output directory on
     * the node or mounted filesystem.
     */
    @JsonProperty(value = "properties.jobOutputDirectoryPathSegment", access = JsonProperty.Access.WRITE_ONLY)
    private String jobOutputDirectoryPathSegment;

    /*
     * The path where the Batch AI service stores stdout, stderror and
     * execution log of the job.
     */
    @JsonProperty(value = "properties.stdOutErrPathPrefix")
    private String stdOutErrPathPrefix;

    /*
     * A list of input directories for the job.
     */
    @JsonProperty(value = "properties.inputDirectories")
    private List<InputDirectory> inputDirectories;

    /*
     * A list of output directories for the job.
     */
    @JsonProperty(value = "properties.outputDirectories")
    private List<OutputDirectory> outputDirectories;

    /*
     * A collection of user defined environment variables to be setup for the
     * job.
     */
    @JsonProperty(value = "properties.environmentVariables")
    private List<EnvironmentVariable> environmentVariables;

    /*
     * A collection of user defined environment variables with secret values to
     * be setup for the job. Server will never report values of these variables
     * back.
     */
    @JsonProperty(value = "properties.secrets")
    private List<EnvironmentVariableWithSecretValue> secrets;

    /*
     * Constraints associated with the Job.
     */
    @JsonProperty(value = "properties.constraints")
    private JobPropertiesConstraints constraints;

    /*
     * The creation time of the job.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * The provisioned state of the Batch AI job
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The time at which the job entered its current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningStateTransitionTime;

    /*
     * The current state of the job. Possible values are: queued - The job is
     * queued and able to run. A job enters this state when it is created, or
     * when it is awaiting a retry after a failed run. running - The job is
     * running on a compute cluster. This includes job-level preparation such
     * as downloading resource files or set up container specified on the job -
     * it does not necessarily mean that the job command line has started
     * executing. terminating - The job is terminated by the user, the
     * terminate operation is in progress. succeeded - The job has completed
     * running successfully and exited with exit code 0. failed - The job has
     * finished unsuccessfully (failed with a non-zero exit code) and has
     * exhausted its retry limit. A job is also marked as failed if an error
     * occurred launching the job.
     */
    @JsonProperty(value = "properties.executionState", access = JsonProperty.Access.WRITE_ONLY)
    private ExecutionState executionState;

    /*
     * The time at which the job entered its current execution state.
     */
    @JsonProperty(value = "properties.executionStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime executionStateTransitionTime;

    /*
     * Information about the execution of a job.
     */
    @JsonProperty(value = "properties.executionInfo")
    private JobPropertiesExecutionInfo executionInfo;

    /**
     * Get the schedulingPriority property: Scheduling priority associated with the job.
     *
     * @return the schedulingPriority value.
     */
    public JobPriority schedulingPriority() {
        return this.schedulingPriority;
    }

    /**
     * Set the schedulingPriority property: Scheduling priority associated with the job.
     *
     * @param schedulingPriority the schedulingPriority value to set.
     * @return the JobInner object itself.
     */
    public JobInner withSchedulingPriority(JobPriority schedulingPriority) {
        this.schedulingPriority = schedulingPriority;
        return this;
    }

    /**
     * Get the cluster property: Resource ID of the cluster associated with the job.
     *
     * @return the cluster value.
     */
    public ResourceId cluster() {
        return this.cluster;
    }

    /**
     * Set the cluster property: Resource ID of the cluster associated with the job.
     *
     * @param cluster the cluster value to set.
     * @return the JobInner object itself.
     */
    public JobInner withCluster(ResourceId cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get the mountVolumes property: Collection of mount volumes available to the job during execution. These volumes
     * are mounted before the job execution and unmounted after the job completion. The volumes are mounted at location
     * specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable.
     *
     * @return the mountVolumes value.
     */
    public MountVolumes mountVolumes() {
        return this.mountVolumes;
    }

    /**
     * Set the mountVolumes property: Collection of mount volumes available to the job during execution. These volumes
     * are mounted before the job execution and unmounted after the job completion. The volumes are mounted at location
     * specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable.
     *
     * @param mountVolumes the mountVolumes value to set.
     * @return the JobInner object itself.
     */
    public JobInner withMountVolumes(MountVolumes mountVolumes) {
        this.mountVolumes = mountVolumes;
        return this;
    }

    /**
     * Get the nodeCount property: The job will be gang scheduled on that many compute nodes.
     *
     * @return the nodeCount value.
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the nodeCount property: The job will be gang scheduled on that many compute nodes.
     *
     * @param nodeCount the nodeCount value to set.
     * @return the JobInner object itself.
     */
    public JobInner withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get the containerSettings property: If the container was downloaded as part of cluster setup then the same
     * container image will be used. If not provided, the job will run on the VM.
     *
     * @return the containerSettings value.
     */
    public ContainerSettings containerSettings() {
        return this.containerSettings;
    }

    /**
     * Set the containerSettings property: If the container was downloaded as part of cluster setup then the same
     * container image will be used. If not provided, the job will run on the VM.
     *
     * @param containerSettings the containerSettings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withContainerSettings(ContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get the toolType property: Possible values are: cntk, tensorflow, caffe, caffe2, chainer, pytorch, custom,
     * custommpi, horovod.
     *
     * @return the toolType value.
     */
    public ToolType toolType() {
        return this.toolType;
    }

    /**
     * Set the toolType property: Possible values are: cntk, tensorflow, caffe, caffe2, chainer, pytorch, custom,
     * custommpi, horovod.
     *
     * @param toolType the toolType value to set.
     * @return the JobInner object itself.
     */
    public JobInner withToolType(ToolType toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * Get the cntkSettings property: CNTK (aka Microsoft Cognitive Toolkit) job settings.
     *
     * @return the cntkSettings value.
     */
    public CntKsettings cntkSettings() {
        return this.cntkSettings;
    }

    /**
     * Set the cntkSettings property: CNTK (aka Microsoft Cognitive Toolkit) job settings.
     *
     * @param cntkSettings the cntkSettings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withCntkSettings(CntKsettings cntkSettings) {
        this.cntkSettings = cntkSettings;
        return this;
    }

    /**
     * Get the pyTorchSettings property: pyTorch job settings.
     *
     * @return the pyTorchSettings value.
     */
    public PyTorchSettings pyTorchSettings() {
        return this.pyTorchSettings;
    }

    /**
     * Set the pyTorchSettings property: pyTorch job settings.
     *
     * @param pyTorchSettings the pyTorchSettings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withPyTorchSettings(PyTorchSettings pyTorchSettings) {
        this.pyTorchSettings = pyTorchSettings;
        return this;
    }

    /**
     * Get the tensorFlowSettings property: TensorFlow job settings.
     *
     * @return the tensorFlowSettings value.
     */
    public TensorFlowSettings tensorFlowSettings() {
        return this.tensorFlowSettings;
    }

    /**
     * Set the tensorFlowSettings property: TensorFlow job settings.
     *
     * @param tensorFlowSettings the tensorFlowSettings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withTensorFlowSettings(TensorFlowSettings tensorFlowSettings) {
        this.tensorFlowSettings = tensorFlowSettings;
        return this;
    }

    /**
     * Get the caffeSettings property: Caffe job settings.
     *
     * @return the caffeSettings value.
     */
    public CaffeSettings caffeSettings() {
        return this.caffeSettings;
    }

    /**
     * Set the caffeSettings property: Caffe job settings.
     *
     * @param caffeSettings the caffeSettings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withCaffeSettings(CaffeSettings caffeSettings) {
        this.caffeSettings = caffeSettings;
        return this;
    }

    /**
     * Get the caffe2Settings property: Caffe2 job settings.
     *
     * @return the caffe2Settings value.
     */
    public Caffe2Settings caffe2Settings() {
        return this.caffe2Settings;
    }

    /**
     * Set the caffe2Settings property: Caffe2 job settings.
     *
     * @param caffe2Settings the caffe2Settings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withCaffe2Settings(Caffe2Settings caffe2Settings) {
        this.caffe2Settings = caffe2Settings;
        return this;
    }

    /**
     * Get the chainerSettings property: Chainer job settings.
     *
     * @return the chainerSettings value.
     */
    public ChainerSettings chainerSettings() {
        return this.chainerSettings;
    }

    /**
     * Set the chainerSettings property: Chainer job settings.
     *
     * @param chainerSettings the chainerSettings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withChainerSettings(ChainerSettings chainerSettings) {
        this.chainerSettings = chainerSettings;
        return this;
    }

    /**
     * Get the customToolkitSettings property: Custom tool kit job settings.
     *
     * @return the customToolkitSettings value.
     */
    public CustomToolkitSettings customToolkitSettings() {
        return this.customToolkitSettings;
    }

    /**
     * Set the customToolkitSettings property: Custom tool kit job settings.
     *
     * @param customToolkitSettings the customToolkitSettings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withCustomToolkitSettings(CustomToolkitSettings customToolkitSettings) {
        this.customToolkitSettings = customToolkitSettings;
        return this;
    }

    /**
     * Get the customMpiSettings property: Custom MPI job settings.
     *
     * @return the customMpiSettings value.
     */
    public CustomMpiSettings customMpiSettings() {
        return this.customMpiSettings;
    }

    /**
     * Set the customMpiSettings property: Custom MPI job settings.
     *
     * @param customMpiSettings the customMpiSettings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withCustomMpiSettings(CustomMpiSettings customMpiSettings) {
        this.customMpiSettings = customMpiSettings;
        return this;
    }

    /**
     * Get the horovodSettings property: Specifies the settings for Horovod job.
     *
     * @return the horovodSettings value.
     */
    public HorovodSettings horovodSettings() {
        return this.horovodSettings;
    }

    /**
     * Set the horovodSettings property: Specifies the settings for Horovod job.
     *
     * @param horovodSettings the horovodSettings value to set.
     * @return the JobInner object itself.
     */
    public JobInner withHorovodSettings(HorovodSettings horovodSettings) {
        this.horovodSettings = horovodSettings;
        return this;
    }

    /**
     * Get the jobPreparation property: The specified actions will run on all the nodes that are part of the job.
     *
     * @return the jobPreparation value.
     */
    public JobPreparation jobPreparation() {
        return this.jobPreparation;
    }

    /**
     * Set the jobPreparation property: The specified actions will run on all the nodes that are part of the job.
     *
     * @param jobPreparation the jobPreparation value to set.
     * @return the JobInner object itself.
     */
    public JobInner withJobPreparation(JobPreparation jobPreparation) {
        this.jobPreparation = jobPreparation;
        return this;
    }

    /**
     * Get the jobOutputDirectoryPathSegment property: A segment of job's output directories path created by Batch AI.
     * Batch AI creates job's output directories under an unique path to avoid conflicts between jobs. This value
     * contains a path segment generated by Batch AI to make the path unique and can be used to find the output
     * directory on the node or mounted filesystem.
     *
     * @return the jobOutputDirectoryPathSegment value.
     */
    public String jobOutputDirectoryPathSegment() {
        return this.jobOutputDirectoryPathSegment;
    }

    /**
     * Get the stdOutErrPathPrefix property: The path where the Batch AI service stores stdout, stderror and execution
     * log of the job.
     *
     * @return the stdOutErrPathPrefix value.
     */
    public String stdOutErrPathPrefix() {
        return this.stdOutErrPathPrefix;
    }

    /**
     * Set the stdOutErrPathPrefix property: The path where the Batch AI service stores stdout, stderror and execution
     * log of the job.
     *
     * @param stdOutErrPathPrefix the stdOutErrPathPrefix value to set.
     * @return the JobInner object itself.
     */
    public JobInner withStdOutErrPathPrefix(String stdOutErrPathPrefix) {
        this.stdOutErrPathPrefix = stdOutErrPathPrefix;
        return this;
    }

    /**
     * Get the inputDirectories property: A list of input directories for the job.
     *
     * @return the inputDirectories value.
     */
    public List<InputDirectory> inputDirectories() {
        return this.inputDirectories;
    }

    /**
     * Set the inputDirectories property: A list of input directories for the job.
     *
     * @param inputDirectories the inputDirectories value to set.
     * @return the JobInner object itself.
     */
    public JobInner withInputDirectories(List<InputDirectory> inputDirectories) {
        this.inputDirectories = inputDirectories;
        return this;
    }

    /**
     * Get the outputDirectories property: A list of output directories for the job.
     *
     * @return the outputDirectories value.
     */
    public List<OutputDirectory> outputDirectories() {
        return this.outputDirectories;
    }

    /**
     * Set the outputDirectories property: A list of output directories for the job.
     *
     * @param outputDirectories the outputDirectories value to set.
     * @return the JobInner object itself.
     */
    public JobInner withOutputDirectories(List<OutputDirectory> outputDirectories) {
        this.outputDirectories = outputDirectories;
        return this;
    }

    /**
     * Get the environmentVariables property: A collection of user defined environment variables to be setup for the
     * job.
     *
     * @return the environmentVariables value.
     */
    public List<EnvironmentVariable> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: A collection of user defined environment variables to be setup for the
     * job.
     *
     * @param environmentVariables the environmentVariables value to set.
     * @return the JobInner object itself.
     */
    public JobInner withEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the secrets property: A collection of user defined environment variables with secret values to be setup for
     * the job. Server will never report values of these variables back.
     *
     * @return the secrets value.
     */
    public List<EnvironmentVariableWithSecretValue> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: A collection of user defined environment variables with secret values to be setup for
     * the job. Server will never report values of these variables back.
     *
     * @param secrets the secrets value to set.
     * @return the JobInner object itself.
     */
    public JobInner withSecrets(List<EnvironmentVariableWithSecretValue> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the constraints property: Constraints associated with the Job.
     *
     * @return the constraints value.
     */
    public JobPropertiesConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints property: Constraints associated with the Job.
     *
     * @param constraints the constraints value to set.
     * @return the JobInner object itself.
     */
    public JobInner withConstraints(JobPropertiesConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the creationTime property: The creation time of the job.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the provisioningState property: The provisioned state of the Batch AI job.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioningStateTransitionTime property: The time at which the job entered its current provisioning
     * state.
     *
     * @return the provisioningStateTransitionTime value.
     */
    public OffsetDateTime provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }

    /**
     * Get the executionState property: The current state of the job. Possible values are: queued - The job is queued
     * and able to run. A job enters this state when it is created, or when it is awaiting a retry after a failed run.
     * running - The job is running on a compute cluster. This includes job-level preparation such as downloading
     * resource files or set up container specified on the job - it does not necessarily mean that the job command line
     * has started executing. terminating - The job is terminated by the user, the terminate operation is in progress.
     * succeeded - The job has completed running successfully and exited with exit code 0. failed - The job has finished
     * unsuccessfully (failed with a non-zero exit code) and has exhausted its retry limit. A job is also marked as
     * failed if an error occurred launching the job.
     *
     * @return the executionState value.
     */
    public ExecutionState executionState() {
        return this.executionState;
    }

    /**
     * Get the executionStateTransitionTime property: The time at which the job entered its current execution state.
     *
     * @return the executionStateTransitionTime value.
     */
    public OffsetDateTime executionStateTransitionTime() {
        return this.executionStateTransitionTime;
    }

    /**
     * Get the executionInfo property: Information about the execution of a job.
     *
     * @return the executionInfo value.
     */
    public JobPropertiesExecutionInfo executionInfo() {
        return this.executionInfo;
    }

    /**
     * Set the executionInfo property: Information about the execution of a job.
     *
     * @param executionInfo the executionInfo value to set.
     * @return the JobInner object itself.
     */
    public JobInner withExecutionInfo(JobPropertiesExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cluster() != null) {
            cluster().validate();
        }
        if (mountVolumes() != null) {
            mountVolumes().validate();
        }
        if (containerSettings() != null) {
            containerSettings().validate();
        }
        if (cntkSettings() != null) {
            cntkSettings().validate();
        }
        if (pyTorchSettings() != null) {
            pyTorchSettings().validate();
        }
        if (tensorFlowSettings() != null) {
            tensorFlowSettings().validate();
        }
        if (caffeSettings() != null) {
            caffeSettings().validate();
        }
        if (caffe2Settings() != null) {
            caffe2Settings().validate();
        }
        if (chainerSettings() != null) {
            chainerSettings().validate();
        }
        if (customToolkitSettings() != null) {
            customToolkitSettings().validate();
        }
        if (customMpiSettings() != null) {
            customMpiSettings().validate();
        }
        if (horovodSettings() != null) {
            horovodSettings().validate();
        }
        if (jobPreparation() != null) {
            jobPreparation().validate();
        }
        if (inputDirectories() != null) {
            inputDirectories().forEach(e -> e.validate());
        }
        if (outputDirectories() != null) {
            outputDirectories().forEach(e -> e.validate());
        }
        if (environmentVariables() != null) {
            environmentVariables().forEach(e -> e.validate());
        }
        if (secrets() != null) {
            secrets().forEach(e -> e.validate());
        }
        if (constraints() != null) {
            constraints().validate();
        }
        if (executionInfo() != null) {
            executionInfo().validate();
        }
    }
}
